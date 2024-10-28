package ${package}.${packageName.replace('/','.')}.components.configuration;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * <b>SwaggerConfiguration</b>
 * <p>
 * This class specifies the requirements for the {@link SwaggerConfiguration} component,
 * developed in accordance with the development standards established by bxcode.
 * Collaboration is encouraged for the enhancement and expansion of the archetype-example.
 * </p>
 * <p>
 * <b>Usage:</b>
 * description here!
 * </p>
 *
 * @author bxcode
 * @author dbacilio88@outllok.es
 * @since 28/10/2024
 */

@Configurable
@OpenAPIDefinition(
        info = @Info(
                title = "api-microservices-application",
                version = "1.0.0",
                description = "api-microservices-application"

        )
)
public class SwaggerConfiguration {
}
