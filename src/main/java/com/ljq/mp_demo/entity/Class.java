package com.ljq.mp_demo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 自动生成作者信息
 * @since 2018-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_class")
public class Class extends Model<Class> {

    private static final long serialVersionUID = 1L;

    /**
     * 班级主键
     */
    private String classId;

    /**
     * 班级名称
     */
    private String className;


    @Override
    protected Serializable pkVal() {
        return this.classId;
    }

}
