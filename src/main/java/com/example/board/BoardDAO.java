package com.example.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    class BoardRowMapper implements RowMapper<BoardVO>
    {
        @Override
        public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException
        {
            BoardVO vo = new BoardVO();
            vo.setPrfpdfrom(rs.getString("prfpdfrom"));
            vo.setPrfpdto(rs.getString("prfpdto"));
            vo.setFcltynm(rs.getString("fcltynm"));
            vo.setPrfcast(rs.getString("prfcast"));
            vo.setPrfruntime(rs.getString("prfruntime"));
            vo.setPrfage(rs.getString("prfage"));
            vo.setPcseguidance(rs.getString("pcseguidance"));
            vo.setPoster(rs.getString("poster"));
            vo.setPrfnm(rs.getString("prfnm"));
            vo.setBid(rs.getInt("bid"));
            return vo;
        }
    }
    public List<BoardVO> getBoardList() {
        String sql = "select * from PERFORMANCE order by bid desc";

        return jdbcTemplate.query(sql, new BoardRowMapper());
    }

    public BoardVO getBoard(int id) {
        String sql = "select * from PERFORMANCE where bid = " + id;
        return jdbcTemplate.queryForObject(sql, new BoardRowMapper());
    }

    public int insertBoard(BoardVO vo) {
        String sql = "INSERT INTO PERFORMANCE " +
                "(prfnm, prfpdfrom, prfpdto, fcltynm, prfcast, prfruntime, prfage, pcseguidance, poster) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        return jdbcTemplate.update(sql,
                vo.getPrfnm(),
                vo.getPrfpdfrom(),
                vo.getPrfpdto(),
                vo.getFcltynm(),
                vo.getPrfcast(),
                vo.getPrfruntime(),
                vo.getPrfage(),
                vo.getPcseguidance(),
                vo.getPoster());
    }



    public int deleteBoard(int id)
    {
        String sql = "delete from PERFORMANCE where bid = " + id;
        return jdbcTemplate.update(sql);
    }

    public int updateBoard(BoardVO vo) {
        String sql = "UPDATE PERFORMANCE SET " +
                "prfnm=?, prfpdfrom=?, prfpdto=?, fcltynm=?, prfcast=?, " +
                "prfruntime=?, prfage=?, pcseguidance=?, poster=? " +
                "WHERE bid=?"; // Replace 'bid' with your actual primary key column name

        return jdbcTemplate.update(sql,
                vo.getPrfnm(),
                vo.getPrfpdfrom(),
                vo.getPrfpdto(),
                vo.getFcltynm(),
                vo.getPrfcast(),
                vo.getPrfruntime(),
                vo.getPrfage(),
                vo.getPcseguidance(),
                vo.getPoster(),
                vo.getBid()); // Assuming getBid() gets the ID used in the WHERE clause
    }



}
