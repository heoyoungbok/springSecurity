package com.its.springsecurity.controller;

//
//import com.its.springsecurity.service.DriveService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.http.HttpResponse;
//
//@RestController
//public class ImageController {
//    @Autowired
//    private DriveService driveService;
//
//    @GetMapping("/image/{fileId}")
//    public ResponseEntity<byte[]> getImage(@PathVariable String fileId) throws IOException {
//        File file = driveService.files().get(fileId).execute();
//        if (file == null) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        HttpResponse httpResponse = driveService.getRequestFactory().buildGetRequest(new GenericUrl(file.getDownloadUrl())).execute();
////        byte[] image = IOUtils.toByteArray(httpResponse.getContent());
////        HttpHeaders headers = new HttpHeaders();
////        headers.setContentType(MediaType.IMAGE_PNG);
////        return new ResponseEntity<>(image, headers, HttpStatus.OK);
////    }
//
//}
//@Controller
//public class ImageController {
//    @Value("${images.path}")
//    private String imagesPath;
//
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/images/**").addResourceLocations("file:" + imagesPath);
//
//    }
//}