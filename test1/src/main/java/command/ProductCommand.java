package command;

import org.springframework.web.multipart.MultipartFile;

public class ProductCommand {
	String proNum;
	String catNum;
	String proName;
	String proPrice;
	String proInfo;
	MultipartFile [] proImage;
	
	public MultipartFile[] getProImage() {
		return proImage;
	}
	public void setProImage(MultipartFile[] proImage) {
		this.proImage = proImage;
	}
	public String getProNum() {
		return proNum;
	}
	public void setProNum(String proNum) {
		this.proNum = proNum;
	}
	public String getCatNum() {
		return catNum;
	}
	public void setCatNum(String catNum) {
		this.catNum = catNum;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public String getProPrice() {
		return proPrice;
	}
	public void setProPrice(String proPrice) {
		this.proPrice = proPrice;
	}
	public String getProInfo() {
		return proInfo;
	}
	public void setProInfo(String proInfo) {
		this.proInfo = proInfo;
	}
	
	
	
}
