package com.a102.springbootpsty.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class MybatisPlusGenerator {

    // TODO 修改服务名以及数据表名
    private static final String SERVICE_NAME = "springbootpsty";
    private static final String[] TABLE_NAMES = new String[]{
            "users"};
    public static void main(String[] args) {
// 代码生成器
        AutoGenerator mpg = new AutoGenerator();
// 选择 freemarker 引擎，默认 Velocity
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
// 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setFileOverride(true);//是否覆盖文件
        gc.setOutputDir(System.getProperty("user.dir") + "/src/main/java");//输出路径
        gc.setAuthor("A102");//作者名称
        gc.setOpen(false);//生成后是否自动打开文件
        gc.setSwagger2(false);//是否使用swagger2
        gc.setServiceName("%sService");//生成的service接口名称
        gc.setServiceImplName("%sServiceImpl");
        gc.setBaseResultMap(true);//mapper.xml中生成基础resultMap
        gc.setBaseColumnList(true);//mapper.xml中生成基础columnList
        mpg.setGlobalConfig(gc);
// 数据库配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);//数据类型
        dsc.setUrl("jdbc:mysql://localhost:3306/a102db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        mpg.setDataSource(dsc);
// 包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(SERVICE_NAME);
        pc.setParent("com.a102");
        pc.setServiceImpl("service");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);
// 设置模板
        TemplateConfig tc = new TemplateConfig();
        mpg.setTemplate(tc);
// 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);//表名映射到实体策略，带下划线的转成驼峰
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//列名映射到类型属性策略，带下划线的转成驼峰
        strategy.setEntityLombokModel(true);//实体类使用lombok
// strategy.setRestControllerStyle(true);//controller使用rest接口模式
        strategy.setInclude(TABLE_NAMES);//设置表名
// strategy.setTablePrefix("tb_");//表名映射到实体名称去掉前缀
        strategy.setEntityBooleanColumnRemoveIsPrefix(true);// Boolean类型字段是否移除is前缀处理
        mpg.setStrategy(strategy);
        mpg.execute();
    }
}
