package com.xxnan.reper.mapper;

import com.xxnan.reper.pojo.entity.SongList;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SongListMapper {
    int insert(SongList songList);

    @Delete("delete from song_list where id=#{id}")
    int delById(Integer id);

    List<SongList> criteriaQuery(String title, String style);

    int update(SongList songList);
}
