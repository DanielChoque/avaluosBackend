package com.html.avaluos.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.html.avaluos.dao.AvaluoDao;
import com.html.avaluos.dao.CompanyDao;
import com.html.avaluos.dao.LetterDao;
import com.html.avaluos.dao.MunicipalityDao;
import com.html.avaluos.dao.PhoneDao;
import com.html.avaluos.dao.UbicationDao;
import com.html.avaluos.dao.UserAdminDao;
import com.html.avaluos.dao.UserDao;
import com.html.avaluos.methods.Met_File;
import com.html.avaluos.model.Ava_Avaluo;
import com.html.avaluos.model.Ava_Company;
import com.html.avaluos.model.Ava_Letter;
import com.html.avaluos.model.Ava_Municipality;
import com.html.avaluos.model.Ava_Phone;
import com.html.avaluos.model.Ava_Ubication;
import com.html.avaluos.model.Ava_User;
import com.html.avaluos.model.Ava_UserAdmin;
import com.html.avaluos.valuesd.Valores;

@RestController
public class IndexController {
	//@Autowired
	//Tabla0Dao tabla0Dao;
	@Autowired
	UserDao userDao;
	@Autowired
	PhoneDao phoneDao;
	@Autowired
	MunicipalityDao municipalityDao;
	@Autowired
	UbicationDao ubicationDao;
	
	@RequestMapping("/m")
	public List<Ava_Municipality>  cityM() {
		List<Ava_Municipality> municipalities=new ArrayList<>();
		municipalities=(List<Ava_Municipality>) municipalityDao.findAll();
		return  municipalities;
	}
	@RequestMapping("/u")
	public Ava_User user() {
		Ava_User user=new Ava_User();
		user.setCi("10036027");
		user.setLastName("canaviri");
		user.setName("federyco");
		user.setTypeUser("Dueño");
		user.setPhones(null);
		Date fecha=new Date();
		user.setBirthday(fecha);
		Ava_User userTemp=userDao.save(user);
		
		Ava_Phone phone=new Ava_Phone();
		phone.setNumberPhone("75203696");
		phone.setTypePhone("Movil");
		phone.setUser(userTemp);
		phoneDao.save(phone);
		Ava_Phone phone2=new Ava_Phone();
		phone2.setNumberPhone("222266565");
		phone2.setTypePhone("Home");
		phone2.setUser(userTemp);
		phoneDao.save(phone2);
		List<Ava_Phone> phones=new ArrayList<>();
		phones.add(phone);
		phones.add(phone2);
		userTemp.setPhones(phones);
		userTemp=userDao.save(userTemp);
		return userTemp;
	}
	@RequestMapping("/p")
	public Ava_Phone phone() {
		Ava_Phone phone=new Ava_Phone();
		phone=phoneDao.findOne((long) 1);
		return phone;
	}
	@RequestMapping("/r")
	public Ava_User userR() {
		Ava_User user=userDao.findOne((long) 1);
		System.out.println("daniel:"+user.toString());
		return user;
	}
	@RequestMapping("/uc/{itemId}")
	public Ava_Municipality uc(@PathVariable("itemId") Long itemId) {
		 Ava_Municipality mu=municipalityDao.findOne(itemId);
		return mu;
	}
	@RequestMapping("/ub")
	public Ava_Ubication userub() {
		Ava_Ubication ubi=new Ava_Ubication();
		ubi.setAdicionales("");
		ubi.setMunicipality(municipalityDao.findOne((long) 6));
		ubi.setDireccion("Hermogenes Aguirre");
		ubi.setLote("15");
		ubi.setManzana("B");
		ubi.setNumero("9234");
		ubi.setTipoDireccion("Av");
		ubi.setUrbanizacion("San Salvador");
		ubi.setZona("");
		ubi=ubicationDao.save(ubi);
		return ubi;
	}
	@Autowired 
	LetterDao letterDao; 
	@RequestMapping("/le/{itemId}")
	public Ava_Letter letter(@PathVariable("itemId") Long itemId) {
		 Ava_Letter mu=letterDao.findOne(itemId);
		return mu;
	}
	
	@Autowired 
	UserAdminDao userAdminDao; 
	@RequestMapping("/usad/{itemId}")
	public Ava_UserAdmin admin(@PathVariable("itemId") String itemId) {
		 Ava_UserAdmin mu=userAdminDao.findByNameAdmin(itemId);
		return mu;
	}
	
	@Value("${urlimage.path}")
	private String enableMocks;
	@RequestMapping("/file")
	public String fichero() {
		//Met_File meth=new Met_File();
		//meth.createDir();
		String ruta = "E:/avaluos/archivo.txt";
		boolean directorio = new File("c:\\temp\\directorio").mkdirs();
		System.out.println("boolena:"+directorio+" value:"+this.enableMocks);
		File archivo = new File(ruta);
		BufferedWriter bw;
		if(archivo.exists()) {
			System.out.println(" existe");
			try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write("El fichero de texto ya estaba creado.");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      // El fichero ya existe
		} else {
			 try {
				bw = new BufferedWriter(new FileWriter(archivo));
				bw.write("Acabo de crear el fichero de texto.");
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         
			System.out.println("no existe");
		      // El fichero no existe y hay que crearlo
		}
		 OutputStream opStream = null;
	        try {
	            byte[] byteContent = Base64.getDecoder().decode(new Valores().imagen());;
	            File myFile = new File("E:/avaluos/dani.jpg");
	            // check if file exist, otherwise create the file before writing
	            if (!myFile.exists()) {
	                myFile.createNewFile();
	            }
	            opStream = new FileOutputStream(myFile);
	            opStream.write(byteContent);
	            opStream.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{
	                if(opStream != null) opStream.close();
	            } catch(Exception ex){
	                 
	            }
	        }
		
		return "";
	}
	@Autowired
	AvaluoDao avaluoDao;
	@RequestMapping("/a")
	public Ava_Avaluo avaluo() {
		Ava_Avaluo avaluo=avaluoDao.findOne((long) 1);
		//System.out.println("avaluo:"+avaluo.toString());
		return avaluo;
	}
	@Autowired
	CompanyDao companyDao;
	@RequestMapping("/com")
	public Ava_Company Company() {
		Ava_Company avaluo=companyDao.findOne((long) 1);
		/*Ava_User user=userDao.findOne((long) 2);
		List<Ava_User> responsibleCompany=new ArrayList<>();
		responsibleCompany.add(user);
		Ava_User user2=userDao.findOne((long) 16);
		responsibleCompany.add(user2);
		avaluo.setResponsibleCompany(responsibleCompany);*/
		return avaluo;
	}
	@RequestMapping("/sp")
	public String sp() {
		//boolean directorio = new File("c:/temp/daniekkk").mkdirs();
		Met_File met_File=new Met_File();
		System.out.println("enableMocks: "+enableMocks+"  "+met_File.createDir("saniel"));
		Valores valores=new Valores();
		String s=valores.imagen();
		String[] parts = s.split("::");
		String name = parts[0];
		
		return ""+name;
	}
	@Value("${urlimage.path}")
	private String dirf;
	int i=0;
	@RequestMapping(value="/uploadMultipleFiles",method =RequestMethod.POST)
	@ResponseBody
	public String create(@RequestParam("file") MultipartFile[] file) {
		i++;
		String dir=dirf+"AVA-"+i;
		Met_File met=new Met_File();
		met.createDir(dir);
		for (MultipartFile multipartFile : file) {
			String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
			met.saveFile(dir+"/", multipartFile,fileName);
		}		
		System.out.println("da:"+file.length);
		return ""+file.length;
	}
	
	 @GetMapping("/downloadFile/{fileName:.+}")
	    public ResponseEntity<Resource> downloadFile(@PathVariable String fileName, HttpServletRequest request) {
		 Path fileStorageLocation= Paths.get(dirf+"AVA-2").toAbsolutePath().normalize();
		 Path filePath = fileStorageLocation.resolve(fileName).normalize();
		 try {
			Resource resource = new UrlResource(filePath.toUri());
			String contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
			System.out.println("image");
			return ResponseEntity.ok()
	                .contentType(MediaType.parseMediaType(contentType))
	                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
	                .body(resource);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			System.out.println("image s");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("image ddd");
			e.printStackTrace();
		}
		 
		 return ResponseEntity.noContent().build();		 
	 }
}
