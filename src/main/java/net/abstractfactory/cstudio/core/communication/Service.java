package net.abstractfactory.cstudio.core.communication;

import java.util.Set;

/**
 * set of API
 * 
 * @author jack
 *
 */
public class Service {

	private String name;

	private Protocol protocol;

	private ContentType type;

	private Set<Api> apis;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Protocol getProtocol() {
		return protocol;
	}

	public void setProtocol(Protocol protocol) {
		this.protocol = protocol;
	}

	public ContentType getType() {
		return type;
	}

	public void setType(ContentType type) {
		this.type = type;
	}

	public Set<Api> getApis() {
		return apis;
	}

	public void setApis(Set<Api> apis) {
		this.apis = apis;
	}

}
