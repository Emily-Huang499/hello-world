//package com.indi.webdev.test;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.nio.charset.StandardCharsets;
//
//public class ServerTest {
//	public static void main(String[] args) throws IOException {
//		ServerSocket ss = new ServerSocket(8080);
//		System.out.println("server is running...");
//		for (;;) {
//			Socket sock = ss.accept();
//			System.out.println("connected from " + sock.getRemoteSocketAddress());
//			Thread t = new Handler(sock);
//			t.start();
//		}
//	}
//}
//
//class Handler extends Thread {
//	Socket sock;
//
//	public Handler(Socket sock) {
//		this.sock = sock;
//	}
//
//	public void run() {
//		try (InputStream input = this.sock.getInputStream()) {
//			try (OutputStream output = this.sock.getOutputStream()) {
//				handle(input, output);
//			}
//		} catch (Exception e) {
//			try {
//				this.sock.close();
//			} catch (IOException ioe) {
//			}
//			System.out.println("client disconnected.");
//		}
//	}
//
//	private void handle(InputStream input, OutputStream output) throws IOException {
//		var reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
//		var writer = new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
//	}
//}