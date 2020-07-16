package com.echo.entity;

import java.util.List;

/**
 * className: ResultEntity <BR>
 * description: 分页的返回实体<BR>
 * remark: <BR>
 * author: ChenQi <BR>
 * createDate: 2020-07-16 14:49 <BR>
 */
public class ResultEntity {
   private int total;
   private List<?> rows;

   public ResultEntity() {
   }

   public int getTotal() {
       return total;
   }

   public void setTotal(int total) {
       this.total = total;
   }

   public List<?> getRows() {
       return rows;
   }

   public void setRows(List<?> rows) {
       this.rows = rows;
   }
}
