package fun.fleamarket;

import cn.hutool.core.io.resource.ClassPathResource;
import cn.hutool.core.io.resource.Resource;
import cn.hutool.core.io.resource.ResourceUtil;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.keywords.MySqlKeyWordsHandler;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CodeGenerater {

    Properties properties;

    @BeforeAll
    public void setUp() throws IOException {
        ClassPathResource resource = new ClassPathResource("test.properties");
        properties = new Properties();
        properties.load(resource.getStream());

    }

    @Test
    public void all() {

        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder(properties.getProperty("jdbc.url"),
                properties.getProperty("jdbc.username"), properties.getProperty("jdbc.password"))
                .dbQuery(new MySqlQuery())
                .typeConvert(new MySqlTypeConvert())
                .keyWordsHandler(new MySqlKeyWordsHandler())
                .build();

        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfig);

        GlobalConfig globalConfig = new GlobalConfig.Builder()
                .fileOverride()
                .outputDir(properties.getProperty("output"))
                .author("zhujun")
                .enableSwagger()
                .dateType(DateType.TIME_PACK)
                .commentDate("yyyy-MM-dd")
                .build();
        autoGenerator.global(globalConfig);

        PackageConfig packageConfig = new PackageConfig.Builder()
                .parent("fun.fleamarket")
                .pathInfo(Collections.singletonMap(OutputFile.xml, properties.getProperty("output.mapper") ))
                .build();
        autoGenerator.packageInfo(packageConfig);

        StrategyConfig strategyConfig = new StrategyConfig.Builder()
                .mapperBuilder()
                .superClass(BaseMapper.class)
                .enableMapperAnnotation()
                .enableBaseResultMap()
                .enableBaseColumnList()
                .build();
        autoGenerator.strategy(strategyConfig);


        TemplateConfig templateConfig = new TemplateConfig.Builder()
                .build();

        autoGenerator.template(templateConfig).execute();


    }

}
