package online.mrwallet.www;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Message {
	
	private String message;
	private List<String> listData;
	private Set<String> setData; 
	private Map<String, String> mapData;
	private Properties propertiesData;
	
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getListData() {
		return listData;
	}

	public void setListData(List<String> listData) {
		this.listData = listData;
	}

	public Set<String> getSetData() {
		return setData;
	}

	public void setSetData(Set<String> setData) {
		this.setData = setData;
	}

	public Map<String, String> getMapData() {
		return mapData;
	}

	public void setMapData(Map<String, String> mapData) {
		this.mapData = mapData;
	}

	public Properties getPropertiesData() {
		return propertiesData;
	}

	public void setPropertiesData(Properties propertiesData) {
		this.propertiesData = propertiesData;
	}
	
	
}
