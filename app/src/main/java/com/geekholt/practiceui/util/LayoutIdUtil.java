package com.geekholt.practiceui.util;

import com.geekholt.practiceui.R;

/**
 * @author 吴灏腾
 * @date 2020/5/2
 * @describe TODO
 */
public class LayoutIdUtil {
    public enum LayoutType {
        //lesson1
        DRAW_COLOR_VIEW("DRAW_COLOR_VIEW", R.layout.layout_draw_color_view),
        DRAW_CIRCLE_VIEW("DRAW_CIRCLE_VIEW", R.layout.layout_draw_circle_view),
        DRAW_RECT_VIEW("DRAW_RECT_VIEW", R.layout.layout_draw_rect_view),
        DRAW_POINT_VIEW("DRAW_POINT_VIEW", R.layout.layout_draw_point_view),
        DRAW_OVAL_VIEW("DRAW_OVAL_VIEW", R.layout.layout_draw_oval_view),
        DRAW_LINE_VIEW("DRAW_LINE_VIEW", R.layout.layout_draw_line_view),
        DRAW_ROUND_RECT_VIEW("DRAW_ROUND_RECT_VIEW", R.layout.layout_draw_round_view),
        DRAW_ARC_VIEW("DRAW_ARC_VIEW", R.layout.layout_draw_arc_view),
        DRAW_PATH_VIEW("DRAW_PATH_VIEW", R.layout.layout_draw_path_view),
        DRAW_HISTOGRAM_VIEW("DRAW_HISTOGRAM_VIEW", R.layout.layout_draw_histogram_view),
        DRAW_PIE_CHART_VIEW("DRAW_PIE_CHART_VIEW", R.layout.layout_draw_pie_chart_view),
        //lesson2
        LINEAR_GRADIENT_VIEW("LINEAR_GRADIENT_VIEW", R.layout.layout_linear_gradient_view),
        RADIAL_GRADIENT_VIEW("RADIAL_GRADIENT_VIEW", R.layout.layout_radial_gradient_view),
        SWEEP_GRADIENT_VIEW("SWEEP_GRADIENT_VIEW", R.layout.layout_sweep_gradient_view),
        BITMAP_SHADER_VIEW("BITMAP_SHADER_VIEW", R.layout.layout_bitmap_shader_view),
        COMPOSE_SHADER_VIEW("COMPOSE_SHADER_VIEW", R.layout.layout_compose_shader_view),
        LIGHTING_COLOR_FILTER_VIEW("LIGHTING_COLOR_FILTER_VIEW", R.layout.layout_lighting_color_filter_view),
        COLOR_MATRIX_COLOR_FILTER_VIEW("COLOR_MATRIX_COLOR_FILTER_VIEW", R.layout.layout_color_matrix_color_view),
        X_FER_MODE_VIEW("X_FER_MODE_VIEW", R.layout.layout_x_fer_mode_view),
        STROKE_CAP_VIEW("STROKE_CAP_VIEW", R.layout.layout_stroke_cap_view),
        STROKE_JOIN_VIEW("STROKE_JOIN_VIEW", R.layout.layout_stroke_join_view),
        STOCK_MITER_VIEW("STOCK_MITER_VIEW", R.layout.layout_stroke_miter_view),
        PATH_EFFECT_VIEW("PATH_EFFECT_VIEW", R.layout.layout_path_effect_view),
        SHADOW_LAYER_VIEW("SHADOW_LAYER_VIEW", R.layout.layout_shadow_layer_view),
        MASK_FILTER_VIEW("MASK_FILTER_VIEW", R.layout.layout_mask_filter_view),
        FILL_PATH_VIEW("FILL_PATH_VIEW", R.layout.layout_fill_path_view),
        TEXT_PATH_VIEW("TEXT_PATH_VIEW", R.layout.layout_text_path_view),
        //lesson3
        DRAW_TEXT_VIEW("DRAW_TEXT_VIEW", R.layout.layout_draw_text_view),
        STATIC_LAYOUT_VIEW("STATIC_LAYOUT_VIEW", R.layout.layout_static_layout_view),
        SET_TEXT_SIZE_VIEW("SET_TEXT_SIZE_VIEW", R.layout.layout_set_text_size_view),
        SET_TYPE_FACE_VIEW("SET_TYPE_FACE_VIEW", R.layout.layout_set_type_face_view),
        SET_FAKE_BOLD_TEXT_VIEW("SET_FAKE_BOLD_TEXT_VIEW", R.layout.layout_set_fake_bold_text_view),
        SET_STRIKE_THRU_TEXT_VIEW("SET_STRIKE_THRU_TEXT_VIEW", R.layout.layout_set_strike_thru_text_view),
        SET_UNDER_LINE_TEXT_VIEW("SET_UNDER_LINE_TEXT_VIEW", R.layout.layout_set_under_line_text_view),
        SET_TEXT_SKEW_X_VIEW("SET_TEXT_SKEW_X_VIEW", R.layout.layout_set_text_skew_x_view),
        SET_TEXT_SCALE_X_VIEW("SET_TEXT_SCALE_X_VIEW", R.layout.layout_set_text_scale_x_view),
        SET_TEXT_ALIGN_VIEW("SET_TEXT_ALIGN_VIEW", R.layout.layout_set_text_align_view),
        GET_FONT_SPACING_VIEW("GET_FONT_SPACING_VIEW", R.layout.layout_get_font_spacing_view),
        MEASURE_TEXT_VIEW("MEASURE_TEXT_VIEW", R.layout.layout_measure_text_view),
        GET_TEXT_BOUNDS_VIEW("GET_TEXT_BOUNDS_VIEW", R.layout.layout_get_text_bounds_view),
        GET_FONT_METRICS_VIEW("GET_FONT_METRICS_VIEW", R.layout.layout_get_font_metrics_view),
        //lesson4
        CLIP_RECT_VIEW("CLIP_RECT_VIEW", R.layout.layout_clip_rect_view),
        CLIP_PATH_VIEW("CLIP_PATH_VIEW", R.layout.layout_clip_path_view),
        TRANS_LATE_VIEW("TRANS_LATE_VIEW", R.layout.layout_trans_late_view),
        SCALE_VIEW("SCALE_VIEW", R.layout.layout_scale_view),
        ROTATE_VIEW("ROTATE_VIEW", R.layout.layout_rotate_view),
        SKEW_VIEW("SKEW_VIEW", R.layout.layout_skew_view),
        MATRIX_TRANSLATE_VIEW("MATRIX_TRANSLATE_VIEW", R.layout.layout_matrix_translate_view),
        MATRIX_SCALE_VIEW("MATRIX_SCALE_VIEW", R.layout.layout_matrix_scale_view),
        MATRIX_ROTATE_VIEW("MATRIX_ROTATE_VIEW", R.layout.layout_matrix_rotate_view),
        MATRIX_SKEW_VIEW("MATRIX_SKEW_VIEW", R.layout.layout_matrix_skew_view),
        CAMERA_ROTATE_VIEW("CAMERA_ROTATE_VIEW", R.layout.layout_camera_rotate_view),
        CAMERA_ROTATE_FIXED_VIEW("CAMERA_ROTATE_FIXED_VIEW", R.layout.layout_camera_rotate_fixed_view),
        CAMERA_ROTATE_HITTING_FACE_VIEW("CAMERA_ROTATE_HITTING_FACE_VIEW", R.layout.layout_camera_rotate_hitting_face_view),
        FLIP_BOARD_VIEW("FLIP_BOARD_VIEW", R.layout.layout_flip_board_view),
        //lesson5
        ANIM_TRANSLATE("ANIM_TRANSLATE", R.layout.layout_anim_translation),
        ANIM_ROTATION("ANIM_ROTATION", R.layout.layout_anim_rotation),
        ANIM_SCALE("ANIM_SCALE", R.layout.layout_anim_scale),
        ANIM_ALPHA("ANIM_ALPHA", R.layout.layout_anim_alpha),
        ANIM_MULTI_PROPERTIES("ANIM_MULTI_PROPERTIES", R.layout.layout_anim_multi_properties),
        ANIM_DURATION("ANIM_DURATION", R.layout.layout_anim_duration),
        ANIM_INTERPOLATOR("ANIM_INTERPOLATOR", R.layout.layout_anim_interpolator),
        ANIM_OBJECT_ANIMATOR("ANIM_OBJECT_ANIMATOR", R.layout.layout_object_animator),
        //lesson6
        ANIM_ARGB_EVALUATOR("ANIM_ARGB_EVALUATOR", R.layout.layout_anim_argb_evaluator),
        ANIM_HSV_EVALUATOR("ANIM_HSV_EVALUATOR", R.layout.layout_anim_hsv_evaluator),
        ANIM_OF_OBJECT("ANIM_OF_OBJECT", R.layout.layout_anim_of_object),
        ANIM_PROPERTY_VALUES_HOLDER("ANIM_PROPERTY_VALUES_HOLDER", R.layout.layout_anim_property_values_holder),
        ANIM_ANIMATOR_SET("ANIM_ANIMATOR_SET", R.layout.layout_anim_animator_set),
        ANIM_KEY_FRAME("ANIM_KEY_FRAME", R.layout.layout_anim_keyframe);

        private String name;
        private int layoutId;

        LayoutType(String name, int layoutId) {
            this.name = name;
            this.layoutId = layoutId;
        }
    }


    public static int getLayoutId(String type) {
        return LayoutType.valueOf(type).layoutId;
    }
}
