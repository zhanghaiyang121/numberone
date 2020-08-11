package com.numberone.project.student.service;

import java.util.List;
import com.numberone.project.student.domain.SchoolStudent;
import com.numberone.framework.web.domain.Ztree;

/**
 * 学生Service接口
 * 
 * @author numberone
 * @date 2020-05-04
 */
public interface ISchoolStudentService 
{
    /**
     * 查询学生
     * 
     * @param id 学生ID
     * @return 学生
     */
    public SchoolStudent selectSchoolStudentById(Long id);

    /**
     * 查询学生列表
     * 
     * @param schoolStudent 学生
     * @return 学生集合
     */
    public List<SchoolStudent> selectSchoolStudentList(SchoolStudent schoolStudent);

    /**
     * 新增学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    public int insertSchoolStudent(SchoolStudent schoolStudent);

    /**
     * 修改学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    public int updateSchoolStudent(SchoolStudent schoolStudent);

    /**
     * 批量删除学生
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolStudentByIds(String ids);

    /**
     * 删除学生信息
     * 
     * @param id 学生ID
     * @return 结果
     */
    public int deleteSchoolStudentById(Long id);

    /**
     * 查询学生树列表
     * 
     * @return 所有学生信息
     */
    public List<Ztree> selectSchoolStudentTree();
}
