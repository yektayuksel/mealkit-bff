package com.mealkit.bff.api.service.product.tag;

import com.mealkit.bff.api.model.product.request.TagApiInput;
import com.mealkit.bff.api.model.product.response.TagApiOutput;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TagService {

    ResponseEntity<List<TagApiOutput>> getTags();

    ResponseEntity<TagApiOutput> getTagById(Long tagId) throws Exception;

    ResponseEntity<List<TagApiOutput>> getTagsByIds(List<Long> tagIdList);

    void createTag(TagApiInput tagApiInput);
}
