package com.code.app18012022.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.code.app18012022.HRChatActivity;
import com.code.app18012022.InterviewStatusActivity;
import com.code.app18012022.JoinMeetingActivity;
import com.code.app18012022.LearningActivity;
import com.code.app18012022.MatchingJobsActivity;
import com.code.app18012022.NotificationActivity;
import com.code.app18012022.ProfileActivity;
import com.code.app18012022.R;
import com.code.app18012022.RegisterEmailActivity;
import com.code.app18012022.RequestInterviewActivity;
import com.code.app18012022.ScanDocActivity;
import com.code.app18012022.ScheduleInterviewActivity;
import com.code.app18012022.UploadResumeActivity;
import com.code.app18012022.databinding.FragmentHomeBinding;

import java.math.BigInteger;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();





///////////////////////////////////////////////  SEND TO PROFILE /////////////////////////////////
        binding.imageViewProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewProfileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProfileActivity.class);
                startActivity(intent);
            }
        });

////////////////////////////////////////////// SEND TO MATCHING JOB  //////////////////////////////////////
        binding.imageViewJobLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MatchingJobsActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewJob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MatchingJobsActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewJobText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MatchingJobsActivity.class);
                startActivity(intent);
            }
        });

////////////////////////////////////////////// SEND TO REQUEST INTERVIEW //////////////////////////////////////
        binding.imageViewRequestInterviewLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RequestInterviewActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewRequestInterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RequestInterviewActivity.class);
                startActivity(intent);
            }
        });
        binding.textViewRequestInterview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RequestInterviewActivity.class);
                startActivity(intent);
            }
        });

/////////////////////////////////////////////// SEND TO CHAT//////////////////////////////////////////
        binding.imageViewChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HRChatActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewChatText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HRChatActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewChatLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), HRChatActivity.class);
                startActivity(intent);
            }
        });


////////////////////////////////////////////// SEND TO SCHEDULE INTERVIEW //////////////////////////////////////
      binding.imageViewScheduleLayout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(getContext(), ScheduleInterviewActivity.class);
              startActivity(intent);
          }
      });
        binding.imageViewSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ScheduleInterviewActivity.class);
                startActivity(intent);
            }
        });
        binding.textViewSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ScheduleInterviewActivity.class);
                startActivity(intent);
            }
        });

////////////////////////////////////////////// SEND TO SCAN DOC //////////////////////////////////////
        binding.imageViewScanDocumentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ScanDocActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewScanDocument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ScanDocActivity.class);
                startActivity(intent);
            }
        });
        binding.textViewScanDocument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),ScanDocActivity.class);
                startActivity(intent);
            }
        });
/////////////////////////////////////////////SEND TO INTERVIEW STATUS ///////////////////////////
        binding.imageViewInterviewStatusLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),InterviewStatusActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewInterviewStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),InterviewStatusActivity.class);
                startActivity(intent);
            }
        });
        binding.textViewInterviewStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),InterviewStatusActivity.class);
                startActivity(intent);
            }
        });


////////////////////////////////////////////// SEND TO LEARN //////////////////////////////////////
        binding.imageViewLearnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LearningActivity.class);
                startActivity(intent);
            }
        });
        binding.imageViewLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LearningActivity.class);
                startActivity(intent);
            }
        });
        binding.textViewLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LearningActivity.class);
                startActivity(intent);
            }
        });

////////////////////////////////////////////// SEND TO SUPPORT //////////////////////////////////////


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}