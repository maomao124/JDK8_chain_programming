package mao;

import java.util.StringJoiner;

/**
 * Project name(项目名称)：JDK8_chain_programming
 * Package(包名): mao
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/10/30
 * Time(创建时间)： 17:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    private Long id;
    private String name;
    private String sex;
    private Integer age;

    public Long getId()
    {
        return id;
    }

    public Student setId(Long id)
    {
        this.id = id;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public Student setName(String name)
    {
        this.name = name;
        return this;
    }

    public String getSex()
    {
        return sex;
    }

    public Student setSex(String sex)
    {
        this.sex = sex;
        return this;
    }

    public Integer getAge()
    {
        return age;
    }

    public Student setAge(Integer age)
    {
        this.age = age;
        return this;
    }

    @Override
    public String toString()
    {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("sex='" + sex + "'")
                .add("age=" + age)
                .toString();
    }
}
