package com.mealkit.bff.web.product;


import com.mealkit.bff.api.client.product.TagClient;
import com.mealkit.bff.api.model.product.request.TagApiInput;
import com.mealkit.bff.api.model.product.response.TagApiOutput;
import com.mealkit.bff.api.service.product.tag.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ingredient")
public class TagWebApi {

    private final TagService tagService;

    @GetMapping("/getTags")
    public ResponseEntity<List<TagApiOutput>> getTags() {
        return tagService.getTags();
    }

    @GetMapping("/getTagById/{tagId}")
    public ResponseEntity<TagApiOutput> getTagById(@PathVariable Long tagId) throws Exception {
        return tagService.getTagById(tagId);
    }

    @PostMapping("/getTagsByIds")
    public ResponseEntity<List<TagApiOutput>> getTagsByIds(@RequestBody List<Long> tagIdList) {
        return tagService.getTagsByIds(tagIdList);
    }

    @PostMapping("/createTag")
    public ResponseEntity<Void> createTag(@RequestBody TagApiInput tagApiInput) {
        tagService.createTag(tagApiInput);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
