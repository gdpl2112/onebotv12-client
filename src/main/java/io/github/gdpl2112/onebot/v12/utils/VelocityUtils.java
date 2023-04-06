package io.github.gdpl2112.onebot.v12.utils;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.StringWriter;

/**
 * @author github.kloping
 */
public class VelocityUtils {

    public static final VelocityEngine VE = new VelocityEngine();

    static {
        VE.setProperty(Velocity.INPUT_ENCODING, "UTF-8");
        VE.setProperty(Velocity.OUTPUT_ENCODING, "UTF-8");
        VE.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        VE.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        VE.init();
    }

    public static String getTemplateToString(String name, Object... args) {
        name = name.endsWith(".vm") ? name : name + ".vm";
        Template t = VE.getTemplate("templates/" + name);
        VelocityContext ctx = new VelocityContext();
        if (args.length > 0) {
            char c = 'a';
            for (Object arg : args) {
                ctx.put(String.valueOf(c++), arg);
            }
        }
        StringWriter sw = new StringWriter();
        t.merge(ctx, sw);
        return sw.toString();
    }
}
