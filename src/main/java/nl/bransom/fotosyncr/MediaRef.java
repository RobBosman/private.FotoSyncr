package nl.bransom.fotosyncr;

import java.net.URI;

public class MediaRef {

  private final String id;
  private final URI uri;
  private long size = 0;

  public MediaRef(final URI uri) {
    this.uri = uri;
    id = "";
  }
}
