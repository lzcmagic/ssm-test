package com.lzc.basicssm.dao;

import com.lzc.basicssm.domain.Items;
import com.lzc.basicssm.domain.ItemsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ItemsDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int countByExample(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int deleteByExample(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int insert(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int insertSelective(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    List<Items> selectByExampleWithBLOBs(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    List<Items> selectByExample(ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    Items selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int updateByExampleSelective(@Param("record") Items record, @Param("example") ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Items record, @Param("example") ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int updateByExample(@Param("record") Items record, @Param("example") ItemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int updateByPrimaryKeySelective(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Items record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table items
     *
     * @mbggenerated Mon Jul 23 13:24:56 CST 2018
     */
    int updateByPrimaryKey(Items record);
}