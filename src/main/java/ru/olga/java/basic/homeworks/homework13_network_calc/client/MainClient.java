package ru.olga.java.basic.homeworks.homework13_network_calc.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MainClient {

        public static void main(String[] args) {


            try(Socket socket = new Socket("localhost", 8888);
                PingClient client = new PingClient(socket)
            ) {
                System.out.println(client.read());
                System.out.println("Введите через пробелы два числа и операцию");
                Scanner scanner = new Scanner(System.in);
                String userInput = scanner.nextLine();
                client.send(userInput);
                System.out.println(client.read());
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
}
