# java-mcp

A skeleton Java implementation of the Model Context Protocol (MCP) transport specification.

This project aims to provide a basic framework for handling MCP messages over the defined `stdio` and `Streamable HTTP` transports as described in the [specification](https://modelcontextprotocol.io/specification/2025-03-26/basic/transports).

**Note:** This is currently a skeleton and requires significant implementation work to become functional.

## Project Structure (Skeleton)

- `src/main/java/io/modelcontextprotocol/transports/`: Placeholder for transport handling classes.

## TODO

- Implement the `stdio` transport mechanism.
- Implement the `Streamable HTTP` transport mechanism, including POST/GET handling, SSE, session management, and resumability.
- Add JSON-RPC message parsing and serialization logic.
- Integrate with the MCP lifecycle (initialization, etc.).
- Add proper error handling and security considerations (especially for HTTP).
- Set up a build system (Maven/Gradle).
- Write comprehensive tests.