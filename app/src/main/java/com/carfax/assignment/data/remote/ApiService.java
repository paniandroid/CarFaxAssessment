package com.carfax.assignment.data.remote;

import io.reactivex.Single;
import com.carfax.assignment.model.AssignmentResponse;
import retrofit2.http.GET;

public interface ApiService {
    @GET("assignment.json")
    Single<AssignmentResponse> getAssignmentResponse();
}