package com.salesmanager.core.modules.cms.impl;

import org.infinispan.manager.EmbeddedCacheManager;
import org.infinispan.tree.TreeCache;

public interface CacheManager {
	
	public EmbeddedCacheManager getManager();
	
	@SuppressWarnings("rawtypes")
	public TreeCache getTreeCache();

}
