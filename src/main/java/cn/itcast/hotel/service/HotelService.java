package cn.itcast.hotel.service;

import cn.itcast.hotel.domain.Hotel;
import cn.itcast.hotel.domain.PageResult;
import cn.itcast.hotel.domain.RequestParams;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface HotelService extends IService<Hotel> {
    PageResult search(RequestParams params);

    Map<String, List<String>> getFilters(RequestParams params);

    List<String> getSuggestion(String key);

    void deleteById(Long hotelId);

    void saveById(Long hotelId);
}
