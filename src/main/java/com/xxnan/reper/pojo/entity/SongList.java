package com.xxnan.reper.pojo.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

//@TableName(value = "song_list")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SongList implements Serializable {

//    @TableId(type = IdType.AUTO)
    private Integer id;

    private String title;

    private String pic;

    private String style;

    private String introduction;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
