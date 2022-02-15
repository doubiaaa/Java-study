package com.kuang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author A102
 * @since 2021-12-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Standard implements Serializable {



    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String stdNum;

    private String zhname;

    private String version;

    private String keys;

    private LocalDate releaseDate;

    private LocalDate implDate;

    private String packagePa;


}
