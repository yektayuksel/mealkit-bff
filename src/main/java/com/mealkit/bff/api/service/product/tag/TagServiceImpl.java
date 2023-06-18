package com.mealkit.bff.api.service.product.tag;

import com.mealkit.bff.api.client.product.TagClient;
import com.mealkit.bff.api.model.product.request.TagApiInput;
import com.mealkit.bff.api.model.product.response.TagApiOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagClient tagClient;
    @Override
    public ResponseEntity<List<TagApiOutput>> getTags() {
        return tagClient.getTags();
    }

    @Override
    public ResponseEntity<TagApiOutput> getTagById(Long tagId) throws Exception {
        return tagClient.getTagById(tagId);
    }

    @Override
    public ResponseEntity<List<TagApiOutput>> getTagsByIds(List<Long> tagIdList) {
        return tagClient.getTagsByIds(tagIdList);
    }

    @Override
    public void createTag(TagApiInput tagApiInput) {
        tagClient.createTag(tagApiInput);
    }
}
