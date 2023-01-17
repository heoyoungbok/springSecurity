//package com.its.springsecurity.service;
//
//import com.google.api.client.http.HttpRequestFactory;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.oauth2.client.OAuth2RestOperations;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class DriveService {
//
//    private final OAuth2RestOperations restTemplate;
//    public void downloadFile(String fileId) {
//        String url = "https://www.googleapis.com/drive/v3/files/" + fileId + "?alt=media";
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + restTemplate.getAccessToken().getValue());
//        headers.setAccept(Arrays.asList(MediaType.APPLICATION_OCTET_STREAM));
//
//        HttpEntity<String> entity = new HttpEntity<>(headers);
//
//        ResponseEntity<byte[]> response = restTemplate.exchange(url, HttpMethod.GET, entity, byte[].class);
//        byte[] data = response.getBody();
//        // do something with the data, like saving it to a file
//    }
//
//    public <E> List<E> files() {
//    }
//
////    public HttpRequestFactory getRequestFactory() {
////    }
//}
