package design.patterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
	
	@Override
	void buildName() {
		website.setName("Enterprice site");
		
	}

	@Override
	void buildCms() {
		website.setCms(Cms.ALIFRESS);
		
	}

	@Override
	void buildPrice() {
		website.setPrice(10000);
		
	}
}
