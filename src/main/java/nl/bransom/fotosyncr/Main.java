package nl.bransom.fotosyncr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

public class Main {

  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  private static final String BOSMANNAS_PHOTO = "file://10.0.0.6/photo/";

  public static void main(final String[] args) throws Exception {
    new FileRepository(URI.create(BOSMANNAS_PHOTO),
        new Credentials("Rob", "Lemmein00!"))
        .listDirs()
        .forEach(LOG::debug);
  }
}
