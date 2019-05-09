package com.se.dao;

import org.hibernate.Session;
import com.se.pojo.OperationLog;
import com.se.util.HbmUtil;

public class OperationLogDao {
	public OperationLog get(int id) {
		Session session = HbmUtil.getSession();
		OperationLog ol = session.get(OperationLog.class, id);
		HbmUtil.closeSession(session);
		return ol;
	}
}
