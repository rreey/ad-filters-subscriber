package org.fordes.adg.rule.parser;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.fordes.adg.rule.enums.Scope;
import org.fordes.adg.rule.model.Rule;

/**
 * 域名规则解析器
 *
 * @author fordes123 on 2023/4/14
 */
@Slf4j
public class DomainParser extends Parser {

    public DomainParser(String content) {
        super(content);
    }

    @Override
    public Rule get() {
        log.info("域名规则: {}", content);

        //t2.picb.cc^$image,domain=dmxq1.com
        //pathlime.com^$third-party
        if (content.contains("^")) { // ^表示作用域，$是分割符号，后面是作用对象
            String target = StrUtil.subAfter(content, "^", false);
            if (target.contains("$")) {

            } else {

            }

            //t2.picb.cc^$image,domain=dmxq1.com
            //pathlime.com^$third-party
            String suffix = StrUtil.subAfter(content, "^", false);
            StrUtil.split(suffix, StrUtil.COMMA).forEach(s -> {
                //TODO Continue
            });

            if (content.endsWith("^$third-party")) {
                rule.setScope(Scope.THIRD);
            } else {
                rule.setScope(Scope.SUB);
            }
        } else {
            rule.setScope(Scope.MAIN);
        }
        return rule;
    }
}