package com.jd;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


/**
 * mp逆向工程
 */
public class MysqlGenerator {


    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        //1、全局配置
        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");//默认是父级目录的路径
        String projectPath = "D:\\Code\\Mybatis-Study\\mybatis01";
        gc.setOutputDir(projectPath + "/src/main/java");  //生成路径(一般都是生成在此项目的src/main/java下面)
        gc.setAuthor("xielong7"); //设置作者
        gc.setOpen(false);
        gc.setFileOverride(true); //第二次生成会把第一次生成的覆盖掉
        gc.setServiceName("%sService"); //生成的service接口名字首字母是否为I，这样设置就没有
        gc.setBaseResultMap(true); //生成resultMap
        mpg.setGlobalConfig(gc);

        //2、数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/study?useUnicode=true" +
                "&serverTimezone=GMT&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("xielong");
        mpg.setDataSource(dsc);

        // 3、包配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName("sys");
        pc.setParent("com.jd");
        mpg.setPackageInfo(pc);

        // 4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperControllerClass("com.jd.controller.BaseController");
        strategy.setSuperEntityClass("com.jd.entity.BaseEntity");
//        strategy.setTablePrefix("dp_"); // 表名前缀
        strategy.setEntityLombokModel(true); //使用lombok
//        strategy.setInclude("dp_applications");  // 逆向工程使用的表   如果要生成多个,这里可以传入String[]
        strategy.setInclude("blog");  // 逆向工程使用的表   如果要生成多个,这里可以传入String[]
        mpg.setStrategy(strategy);

        //5、执行
        mpg.execute();
    }

}
