// This class would implement the stdio transport mechanism.
// It needs to read from stdin and write to stdout, handling newline delimiters.
// It should interact with McpHandler for message processing.

package io.modelcontextprotocol.java.transports;

import io.modelcontextprotocol.java.McpHandler;

import java.util.Scanner;

public class StdioTransport implements Runnable {

    private final McpHandler mcpHandler;
    private volatile boolean running = true;

    public StdioTransport(McpHandler mcpHandler) {
        this.mcpHandler = mcpHandler;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (running && scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.trim().isEmpty()) {
                // TODO: Validate line as a valid MCP message (JSON-RPC)
                mcpHandler.handleIncomingMessage(line);
            }
        }
        scanner.close();
    }

    public void sendMessage(String message) {
        // TODO: Write message to System.out, ensuring newline delimiter and no embedded newlines
        System.out.println(message); // Basic example
    }

    public void stop() {
        running = false;
        // TODO: Properly shut down scanner or input stream
    }
}
