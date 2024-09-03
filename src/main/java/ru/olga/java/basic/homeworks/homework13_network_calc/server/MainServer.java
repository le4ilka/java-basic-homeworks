package ru.olga.java.basic.homeworks.homework13_network_calc.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket clientAccept = serverSocket.accept();
            System.out.println("Client connected!");
            writeMessage(clientAccept, "Доступные операции: +,-,*,/");
            String userInput = readRequest(clientAccept);
            String result = makeOperation(userInput);
            writeMessage(clientAccept, result);
        }
    }

    private static String readRequest(Socket socket) throws IOException {
        DataInputStream input = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
        String str = input.readUTF();
        //System.out.println("Пользователь ввел:" + str);
        return str;
    }

    private static void writeMessage(Socket socket, String str) throws IOException {
        DataOutputStream output = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        output.writeUTF(str);
        output.flush();
    }

    private static String makeOperation (String str){
        String[] splitStr = str.split(" ");
        try {
            Double firstNumber = Double.parseDouble(splitStr[0]);
            Double secondNumber = Double.parseDouble(splitStr[1]);

        String operation = splitStr[2];
        //System.out.println("Выражение: " + firstNumber + " " + operation + " " + secondNumber);
        double result = 0;

        switch (operation){
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            default:
                return "Такая операция не обрабатывается данным сервером";
        }

        return firstNumber + " " + operation + " " + secondNumber + " = " + result;
        } catch (NumberFormatException e){
            return "Неверные данные";
        }
    }

}
