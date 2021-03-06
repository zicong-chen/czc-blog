package cn.dblearn.blog.entity.mall.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * 首页分类数据VO(第二级)
 */
public class SecondLevelCategoryVO implements Serializable {

    /**
     * 分类id
     */
    @ApiModelProperty(value="分类id")
    private Long categoryId;

    /**
     * 分类级别(1-一级分类 2-二级分类 3-三级分类)
     */
    @ApiModelProperty(value="分类级别(1-一级分类 2-二级分类 3-三级分类)")
    private Byte categoryLevel;

    /**
     * 分类名称
     */
    @ApiModelProperty(value="分类名称")
    private String categoryName;

    /**
     * 父分类id
     */
    @ApiModelProperty(value="父分类id")
    private Long parentId;


    private List<ThirdLevelCategoryVO> thirdLevelCategoryVOS;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Byte getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Byte categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<ThirdLevelCategoryVO> getThirdLevelCategoryVOS() {
        return thirdLevelCategoryVOS;
    }

    public void setThirdLevelCategoryVOS(List<ThirdLevelCategoryVO> thirdLevelCategoryVOS) {
        this.thirdLevelCategoryVOS = thirdLevelCategoryVOS;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}
