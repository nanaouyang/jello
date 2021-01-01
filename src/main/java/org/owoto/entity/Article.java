package org.owoto.entity;

import org.owoto.config.Dict;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;


/**
 * @author cc
 */
@Data
public class Article extends BaseEntity {

    /**
     * title
     */
    private String title;

    /**
     * content
     */
    private String content;


    @TableField(exist = false)
    private Integer viewCount;


    private Integer orderNum;

    @Dict(target = "tagDesc",codeType = "TAG")
    private String tag;

    @TableField(exist = false)
    private String tagDesc;

}