package DemoSpringMVC.Service.User;

import org.springframework.stereotype.Service;

import DemoSpringMVC.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
//	truyen tham so de thuc hien lay du lien phan trang
	public PaginatesDto GetInfoPaginates(int TotalData, int limit, int currentPage);
}
