package com.mealkit.bff.api.client.product;


import com.mealkit.bff.api.model.product.request.TagApiInput;
import com.mealkit.bff.api.model.product.response.TagApiOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value="tagService", url = "http://localhost:8081/api/tag")
public interface TagClient {

    @GetMapping("/getAll")
    ResponseEntity<List<TagApiOutput>> getTags();


    @GetMapping("/getById/{tagId}")
    ResponseEntity<TagApiOutput> getTagById(@PathVariable Long tagId) throws Exception;

    @PostMapping("/getTagsByIds")
    ResponseEntity<List<TagApiOutput>> getTagsByIds(@RequestBody List<Long> tagIdList);


    @PostMapping("/createTag")
    ResponseEntity<Void> createTag(@RequestBody TagApiInput tagApiInput);
}
