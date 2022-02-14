package com.ePay.abs.dao;

import com.ePay.abs.dto.AccountInfo;
import com.ePay.abs.model.AccountBalance;
import com.ePay.abs.model.STMAILID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountInfoRepository extends JpaRepository<AccountBalance, Integer> {

    @Query(value="SELECT ac_no,ac_title,account_type,account_desc,currency, available_balance FROM (SELECT a.ac_no,a.ac_title ac_title,d.short_desc account_type,d.full_desc account_desc,a.cur_code currency, (NVL (b.cur_bal, 0) + NVL (b.shadow_cr, 0)) - (NVL (b.shadow_dr, 0) + NVL (b.block_amt, 0))available_balance FROM emob.mb_account_mst@dbl_agent_banking55 a,emob.mb_account_balance@dbl_agent_banking55 b,emob.mb_customer_mst@dbl_agent_banking55 c,emob.mb_product_mst@dbl_agent_banking55 d WHERE a.cust_no = c.cust_no AND a.ac_type_id = d.ac_type_id AND c.cust_code = '59743300001' AND a.ac_status = 'ACT' AND a.ac_id = b.ac_id ORDER BY a.open_date)",nativeQuery = true)
    String accountInfo();

}
