package cpwu.ecut.service.dto.req;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.List;

/**
 * lost-found
 * cpwu.ecut.service.dto.req
 *
 * @author BlueDriver
 * @email cpwu@foxmail.com
 * @date 2019/04/15 16:50 Monday
 */
@Data
@Validated
public class PublicationAddReq {
    @NotNull
    private Integer applyKind;

    @NotBlank(message = "类别不能为空")
    private String categoryName;

    @NotBlank(message = "标题不能为空")
    private String title;

    @NotBlank(message = "详情不能为空")
    private String about;

    private String location;

    /**
     * base64格式图片
     */
    @NotNull(message = "图片不能为空")
    @Size(max = 3, message = "图片最多3张")
    private List<String> images;
}
