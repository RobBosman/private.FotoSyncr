package nl.bransom.fotosyncr;

import jcifs.smb.NtlmPasswordAuthentication;

public class Credentials {

  private final String name;
  private final String password;

  public Credentials(final String name, final String password) {
    this.name = name;
    this.password = password;
  }

  public NtlmPasswordAuthentication getNtlmdAuthentication() {
    return new NtlmPasswordAuthentication(null, name, password);
  }
}
