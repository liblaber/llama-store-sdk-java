package localhost.localhost;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Environment {
  DEFAULT("http://localhost:8000");

  private final String url;

  public String getUrl() {
    return this.url;
  }
}
