package nl.bransom.fotosyncr;

import jcifs.smb.SmbException;
import jcifs.smb.SmbFile;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileRepository {

  private final URI root;
  private final Credentials credentials;

  public FileRepository(final URI root, final Credentials credentials) {
    this.root = root;
    this.credentials = credentials;
  }

  public List<String> listDirs() throws MalformedURLException, SmbException {
    final SmbFile smbDir = new SmbFile(root.toURL(), credentials.getNtlmdAuthentication());
    return Stream.of(smbDir.listFiles())
        .map(SmbFile::getName)
        .collect(Collectors.toList());
  }
}
