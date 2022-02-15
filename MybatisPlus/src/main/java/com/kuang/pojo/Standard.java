package com.kuang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Standard {

    /** id */
    private Integer id;

    /** stdNum */
    private String stdnum;

    /** zhname */
    private String zhname;

    /** version */
    private String versions;



    /** releaseDate */
    private Date releasedate;

    /** implDate */
    private Date impldate;

    /** packagePa */
    private String packagepa;
}
