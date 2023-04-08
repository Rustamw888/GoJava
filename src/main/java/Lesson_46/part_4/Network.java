package Lesson_46.part_4;

public class Network {

  private String address;
  private String port;

  private Network(String address, String port) {
    this.address = address;
    this.port = port;
  }

  private Network(NetworkBuilder networkBuilder) {
    this.address = networkBuilder.getAddress();
    this.port = networkBuilder.getPort();
  }

  @Override
  public String toString() {
    return "Network{" +
        "address='" + address + '\'' +
        ", port='" + Integer.parseInt(port) + '\'' +
        '}';
  }

  static class NetworkBuilder {
    private String address;
    private String port;

    private String getAddress() {
      return address;
    }

    private String getPort() {
      return port;
    }

    public NetworkBuilder address(String address) {
      this.address = address;
      return this;
    }

    public NetworkBuilder port(String port) {
      this.port = port;
      return this;
    }

    public Network build() {
      return new Network(this);
    }

  }
}

class TestNetwork {
  public static void main(String[] args) {
    Network network = new Network.NetworkBuilder()
        .address("localhost")
        .port("8080").build();
    System.out.println(network);
  }
}