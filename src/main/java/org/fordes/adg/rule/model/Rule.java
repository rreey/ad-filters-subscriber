package org.fordes.adg.rule.model;

import lombok.Data;
import org.fordes.adg.rule.enums.Function;
import org.fordes.adg.rule.enums.Scope;
import org.fordes.adg.rule.enums.Target;

/**
 * 规则实体 <br/>
 * 按内容划分为 {@link #domain} 和 {@link #element} <br/>
 * 按功能划分为 {@link Function#ALLOW} 和 {@link Function#BLOCK} <br/>
 * 按作用域划分为 {@link Scope#MAIN} {@link Scope#SUB} {@link Scope#THIRD} <br/>
 * 按作用对象划分为 {@link Target#DOMAIN} {@link Target#PATH} {@link Target#ELEMENT} <br/>
 *
 * @author fordes123 on 2023/4/14
 */
@Data
public class Rule {

    /**
     * 原始规则
     */
    private String origin;

    /**
     * 规则域名
     */
    private String domain;

    /**
     * 规则路径
     */
    private String element;

    /**
     * 规则作用对象
     */
    private Target target;

    /**
     * 规则功能
     */
    private Function function;

    /**
     * 规则作用域
     */
    private Scope scope;



    public Rule(String origin) {
        this.origin = origin;
    }

}