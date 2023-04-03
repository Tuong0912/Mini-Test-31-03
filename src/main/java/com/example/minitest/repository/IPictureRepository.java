

package com.example.minitest.repository;

import com.example.minitest.model.Category;
import com.example.minitest.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPictureRepository extends JpaRepository<Picture, Long> {
    List<Picture> findPictureByCategory( Category category);
    List<Picture> findByPictureCode( int pictureCode);
}
