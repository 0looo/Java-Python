package service.product;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import command.ProductCommand;
import model.AuthInfo;
import model.ProductDTO;
import repository.ProductRepository;

public class ProductJoinService {
	@Autowired
	ProductRepository productRepository; 
	public void prodJoin(ProductCommand productCommand,
			HttpSession session) {
		AuthInfo authInfo = (AuthInfo)session.getAttribute("authInfo");
		String empNo = authInfo.getGrade();
		
		ProductDTO dto = new ProductDTO();
		dto.setCatNum(productCommand.getCatNum());
		dto.setEmpNo(empNo);
		dto.setProInfo(productCommand.getProInfo());
		dto.setProName(productCommand.getProName());
		dto.setProNum(productCommand.getProNum());
		dto.setProPrice(productCommand.getProPrice());
		
		// 파일처리
		String path = "WEB-INF/view/product/upload";
		String filePath = 
				session.getServletContext().getRealPath(path);
		System.out.println(filePath);
		String goodsImage = "";
		if(productCommand.getProImage() != null) {
			for(MultipartFile mf : productCommand.getProImage()) {
				String original = mf.getOriginalFilename();
				String originalExt = original.substring(original.lastIndexOf("."));  // 확장자 가져옴
				String store = 
						UUID.randomUUID().toString().replace("-", "") + originalExt;
			goodsImage += store + ",";
			//파일저장
			File file = new File(filePath+"/"+store);
			try {
				mf.transferTo(file);
			} catch(IllegalStateException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
			dto.setProImage(goodsImage);
			productRepository.prodInsert(dto);
		}
			
		}
		
	}
}
