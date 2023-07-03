package org.fordes.adg.rule.parser;

import lombok.extern.slf4j.Slf4j;
import org.fordes.adg.rule.model.Rule;

/**
 * 路径规则解析器
 *
 * @author fordes123 on 2023/4/14
 */
@Slf4j
public class PathParser extends Parser {

    public PathParser(String content) {
        super(content);
    }

    @Override
    public Rule get() {
        log.info("路径规则: {}", content);
        return null;
    }

}