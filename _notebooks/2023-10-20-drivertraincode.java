// Main thing to edit is the config.setPort() to the actual port number.
import com.corundumstudio.socketio.*;
import com.pi4j.io.gpio.*;
import com.corundumstudio.socketio.*;

public class RobotControl {

    public static void main(String[] args) {
        // Initialize GPIO
        GpioController gpio = GpioFactory.getInstance();
        GpioPinDigitalOutput motor1 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);
        GpioPinDigitalOutput motor2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02);

        // Initialize Socket.IO
        Configuration config = new Configuration();
        config.setHostname("your_server_address");
        config.setPort(9092); // Change this to the server's port

        final SocketIOServer server = new SocketIOServer(config);

        server.addConnectListener(new ConnectListener() {
            @Override
            public void onConnect(SocketIOClient client) {
                System.out.println("Connected to client");
            }
        });

        server.addDisconnectListener(new DisconnectListener() {
            @Override
            public void onDisconnect(SocketIOClient client) {
                System.out.println("Disconnected from client");
            }
        });
        // This part of the code is an event listener in Java that waits for incoming messages 
        //labeled with the  event name "control". When a message with this event label
        // is received from a connected Socket.IO client, it triggers the onData method to execute.
        server.addEventListener("control", String.class, new DataListener<String>() {
            @Override
            public void onData(SocketIOClient client, String command, AckRequest ackRequest) {
                switch (command) {
                    case "forward":
                        motor1.high();
                        motor2.high();
                        break;
                    case "backward":
                        motor1.low();
                        motor2.low();
                        break;
                    case "left":
                        motor1.low();
                        motor2.high();
                        break;
                    case "right":
                        motor1.high();
                        motor2.low();
                        break;
                    case "stop":
                        motor1.low();
                        motor2.low();
                        break;
                    default:
                        System.out.println("Invalid command");
                }
            }
        });

        server.start();

        // Keep the program running
        try {
            Thread.sleep(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Clean up GPIO on program exit
        gpio.shutdown();
    }
}


